function login()
{    
  var commitid=document.getElementById("post").value;
  localStorage.setItem("Commit",commitid);
   fetch("http://localhost:8080/user/login", {
              method: 'POST',
              headers:{'Content-Type':'application/json'},
              body: JSON.stringify({
      "commitId":  commitid
  })
          })
              .then(res => res.json())
              .then(data => {
                // alert(localStorage.getItem("Commit"))
                // alert(data)
                
                if(data===2)
                { 
                window.open("http://localhost:8080/SDL.html","_self");
                //alert(commitid)
                }
                else if(data==1)
                window.open("http://localhost:8080/OD.html","_self");
              
                else if(data==3)
                window.open("http://localhost:8080/HR.html","_self");
               
                else if(data==4)
                window.open("http://localhost:8080/GDN.html","_self");
                else if(data==5)
                window.open("http://localhost:8080/Finance.html","_self");

              });
}