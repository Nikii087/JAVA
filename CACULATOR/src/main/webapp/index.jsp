<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <div class="container mt-5" >
  <form action="Hello">
  <h1 class="text-center text-primary"><br>CALCULATOR<br></h1>
    NO1:
    <input type="text" name="n1" class= form-control placeholder="Enter 1st Number">
    <br>
     NO2:
    <input type="text" name="n2" class= form-control placeholder="Enter 2nd Number">
    
    <div class="text-center mt-3">
    <button type="submit" name="submit" class="btn btn-primary" value="+">+</button>
    <button type="submit" name="submit" class="btn btn-primary" value="-">-</button>
    <button type="submit" name="submit" class="btn btn-primary" value="*">*</button>
    <button type="submit" name="submit" class="btn btn-primary" value="/">/</button>
    </div>
    </form>
    </div>
    
    <%  
   if(request.getParameter("result")!=null)
		{
	   %>
	   <h1>RESULT</h1>
	   <% 
			out.print("<br> Result of given Numbers is :<br> "+request.getParameter("result"));
			
		}
   
    %>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>