window.onload=function () {
    var li1=document.getElementById('x1');
    var li2=document.getElementById('x2');
    var dom1=document.getElementsByClassName('dom1')[0];
    var dom2=document.getElementsByClassName('dom2')[0];
    
    li1.onclick=function () {
                li2.className='li';
                dom2.style.display='none';
            li1.className='on';
            dom1.style.display='block';
        }
    li2.onclick=function () {
            li1.className='li';
            dom1.style.display='none';
        li2.className='on';
        dom2.style.display='block';
    }
}