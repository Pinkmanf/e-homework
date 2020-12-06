package com.company;

import java.sql.*;


public class JDBC {
    String getInfo(){
        String url="jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true";
        String username="root";
        String password="04512htf?";
        Connection conn=null;
        PreparedStatement pst=null;
        String sql="select age,name from user";
        ResultSet rs=null;
        User user=new User();
        String result="";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,username,password);
            pst=conn.prepareStatement(sql);
            pst.executeQuery();
            sql="select age,name from user";
            rs=pst.executeQuery(sql);
            while(rs.next()){
                user.setAge(rs.getInt("age"));
                user.setName(rs.getString("name"));
                result+=user.toString();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if(rs!=null||pst!=null||conn!=null){
            try{
                assert rs!=null;
                rs.close();
                pst.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
    }

    Result login(int username,int password){
        Result result=new Result();
        String url="jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true";
        String user="root";
        String pswd="04512htf?";
        Connection conn=null;
        PreparedStatement pst=null;
        String sql="select username,password from user";
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,pswd);
            pst=conn.prepareStatement(sql);
            pst.executeQuery();
            sql="select username,password from user";
            rs=pst.executeQuery(sql);

            while(rs.next()){
                if(username==rs.getInt("username")&&password==rs.getInt("password")){
                    rs.close();
                    pst.close();
                    conn.close();
                    result.setCode(10000);
                    result.setMsg("登陆成功");
                    return result;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            assert rs!=null;
            rs.close();
            pst.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        result.setCode(10001);
        result.setMsg("登陆失败");
        return result;
    }
}


