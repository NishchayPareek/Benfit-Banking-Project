
    fetch("http://localhost:8080/OD/gread")
    .then(res => res.json())
    .then(data => build(data))
    .catch(error => console.log(error));
    function build(data)
{
var table =document.getElementById("mytable")
for(var i=0;i<data.length;++i)
{
var row=`<tr>
         <td>${data[i].Mode}</td>
         <td>${data[i].HC}</td>
         <td>${data[i].BenefitID}</td>
         <td>${data[i].SDL_Created_By}</td>
         <td>${data[i].SDL_Created_On}</td>
         <td>${data[i].Status}</td>
         <td>
        <button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#exampleModal1" onclick="view(${data[i].BenefitID})">View Details</button>
      </td>
      <td>
        <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModal" onclick="update(${data[i].BenefitID})">Review Request</button>
      </td>
     </tr>`
table.innerHTML+=row;
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

function update(id)
{
  localStorage.setItem("BenefitID",id);
}
  
function approve()
{   
  
   var id=localStorage.getItem("BenefitID");
  var req_check=document.getElementById("new_req_check").value;
  var conflict=document.getElementById("conflict").value;
  var comments=document.getElementById("comments").value;
  if(req_check==""||conflict==""||comments=="")
  return ;
  if(req_check=="Ok")
  req_check="true";
  else
  req_check="false";
  if(conflict="Ok")
  conflict="true";
  else
  conflict="false";
  fetch(`http://localhost:8080/OD/update/${id}`, {
              method: 'PUT',
              headers:{'Content-Type':'application/json'},
              body: JSON.stringify({
      "od_Req_Check": req_check,
      "od_Conflict_with_Global_Benefit":conflict,
      "od_Comments":comments

  })
          })
              .then(res => res.json())
              .then(data => {
                alert(data)
              });
 
  // alert(conflict)
  // alert(req_check)
  // alert(localStorage.getItem("BenefitID"))
  
}
function reject()
{
  var id=localStorage.getItem("BenefitID");
  fetch(`http://localhost:8080/OD/reject/${id}`, {
    method: 'PUT',
    headers:{'Content-Type':'application/json'}
})
    .then(res => res.json())
    .then(data => console.log(data));

}
