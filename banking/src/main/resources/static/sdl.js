
 // alert(localStorage.getItem("Commit"));
    var a=localStorage.getItem("Commit")
              fetch(`http://localhost:8080/SDL/read/${a}`)
              .then(res => res.json())
              .then(data => buildsdl(data))
              .catch(error => console.log(error));
      
    
              function buildsdl(data)
              {
              var table =document.getElementById("mytable")
              for(var i=0;i<data.length;++i)
              {
              var row=`<tr>
                       <td>${data[i].Mode}</td>
                       <td>${data[i].HC}</td>
                       <td>${data[i].BenefitID}</td>
                       <td>${data[i].Status}</td>
                       <td>
                      <button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#exampleModal1" onclick="view(${data[i].BenefitID})">View Data</button>
                    </td>
                    <td>
                      <button type="button" class="btn btn-outline-success"  onclick="del(${data[i].BenefitID})" >Delete Request</button>
                    </td>
                   </tr>`
              table.innerHTML+=row;
              }
              }
    
    function del(id)
              {
                fetch(`http://localhost:8080/SDL/delete/${id}`, {
              method: 'DELETE',
              headers:{'Content-Type':'application/json'},
              
          })
              .then(res => res.json())
              .then(data => console.log(data));
              window.open("http://localhost:8080/SDL.html","_self");
            }

function proceed()
{
    var mode = document.getElementById("mode").value;
    var head_count= document.getElementById("hc").value;
  //   alert(head_count);
  //  alert(mode);
     fetch("http://localhost:8080/SDL/create", {
              method: 'POST',
              headers:{'Content-Type':'application/json'},
              body: JSON.stringify({
      "mode":  mode,
      "hc":head_count
  })
          })
              .then(res => res.json())
              .then(data => {
                //alert(data)
              });
  
        if (mode === "ANB") {
          window.open("http://localhost:8080/ANB.html","_self");
            }
           else if(mode==="ORC")
            {
              window.open("http://localhost:8080/ORC.html","_self");
            }
            else if(mode==="IJP")
            {
              window.open("http://localhost:8080/IJP.html","_self");
            }
            else if(mode==="ATS")
            {
              window.open("http://localhost:8080/ATS.html","_self");
            }
}

function view(id)
{
  //alert(id)
  fetch(`http://localhost:8080/SDL/Read/${id}`)
  .then(res => res.json())
  .then(data => showdata(data))
  .catch(error => console.log(error));

 function showdata(data)
{
//alert(data[0].Mode);
var table =document.getElementById("view-data-table")
var thead;
if(data[0].Mode=="ANB")
{
thead=`<thead>
<tr>
   <th>Employee Name</th>
  <th>Req Number</th>
  <th>Req Type</th>
</tr>
</thead>

<tbody>
<tr>
  <!-- <th scope="row">1</th>
  
  <td>ANB</td>
  <td>3</td>
  <td>
      <button type="button" class="btn btn-outline-primary">View Data</button>
    </td>
    <td>
      <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModal">Review</button>
    </td> -->
</tr>

</tbody>`
table.innerHTML=thead;
for(var i=0;i<data.length;++i)
{
var row=`<tr>
        <td>${data[i].Employee_Name}</td>
         <td>${data[i].Req_No}</td>
         <td>${data[i].Req_Type}</td>
     </tr>`
table.innerHTML+=row;
}

}
else if(data[0].Mode=="ORC")
{
thead=`<thead>
<tr>
  <th>Req Number</th>
  <th>Req Type</th>
</tr>
</thead>

<tbody>
<tr>
  <!-- <th scope="row">1</th>
  
  <td>ANB</td>
  <td>3</td>
  <td>
      <button type="button" class="btn btn-outline-primary">View Data</button>
    </td>
    <td>
      <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModal">Review</button>
    </td> -->
</tr>

</tbody>`
table.innerHTML=thead;
for(var i=0;i<data.length;++i)
{
var row=`<tr>
         <td>${data[i].Req_No}</td>
         <td>${data[i].Req_Type}</td>
     </tr>`
table.innerHTML+=row;
}
}
else if(data[0].Mode=="IJP")
{
thead=`<thead>
<tr>
<th>Employee Name</th>
  <th>OD</th>
  <th>LOB</th>
  <th>Target Req</th>
  <th>Source Req</th>
</tr>
</thead>

<tbody>
<tr>
  <!-- <th scope="row">1</th>
  
  <td>ANB</td>
  <td>3</td>
  <td>
      <button type="button" class="btn btn-outline-primary">View Data</button>
    </td>
    <td>
      <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModal">Review</button>
    </td> -->
</tr>

</tbody>`
table.innerHTML=thead;
for(var i=0;i<data.length;++i)
{
var row=`<tr>
         <td>${data[i].Employee_Name}</td>
         <td>${data[i].OD}</td>
         <td>${data[i].LOB}</td>
         <td>${data[i].Target_Req}</td>
         <td>${data[i].Source_Req}</td>
     </tr>`
table.innerHTML+=row;
}
}
else if(data[0].Mode=="ATS")
{
thead=`<thead>
<tr>
<th>ATS Id</th>
  <th>GDN Project ID</th>
  <th>Check Taleo</th>

</tr>
</thead>

<tbody>
<tr>
  <!-- <th scope="row">1</th>
  
  <td>ANB</td>
  <td>3</td>
  <td>
      <button type="button" class="btn btn-outline-primary">View Data</button>
    </td>
    <td>
      <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModal">Review</button>
    </td> -->
</tr>

</tbody>`
table.innerHTML=thead;
for(var i=0;i<data.length;++i)
{
    if(data[i].Check_Taleo==1)
    data[i].Check_Taleo="Ok";
    else
    data[i].Check_Taleo="Not Ok";
var row=`<tr>
        
         <td>${data[i].ATS_Id}</td>
         <td>${data[i].GDN_Project_Id}</td>
         <td>${data[i].Check_Taleo}</td>
     </tr>`
table.innerHTML+=row;
}
}

}


}

  
            
 