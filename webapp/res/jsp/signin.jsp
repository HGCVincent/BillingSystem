<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:p="http://primefaces.org/ui">
  <head>
    <title>Sign in</title>
    <link rel="stylesheet" href="../Bootstrap/bootstrap.min.css"/>
    <link rel="stylesheet" href="../css/signin.css"/>
    <script type="text/javascript" src='../js/jquery/jquery-3.3.1.min.js'></script>
    <script type="text/javascript" src='../Bootstrap/bootstrap.min.js'></script>
  </head>
  
  <body class="text-center">
   <f:view>
		<form class="form-signin">
		  <img class="mb-4" src="{{ site.baseurl }}/docs/{{ site.docs_version }}/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72"/>
		  <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
		  <label for="inputEmail" class="sr-only">Email address</label>
		  <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="required" autofocus="autofocus"/>
		  <label for="inputPassword" class="sr-only">Password</label>
		  <input jsfc="h:inputSecret" type="password" id="inputPassword" class="form-control" placeholder="Password" required="required"/>
		  <div class="checkbox mb-3">
		    <label>
		      <input type="checkbox" value="remember-me"> Remember me</input>
		    </label>
		  </div>
		  <h:commandButton class="btn btn-lg btn-primary btn-block" action="login" value="Sign in"/>
		  <p class="mt-5 mb-3 text-muted">&#169; 2018-2019</p>
		</form>
	</f:view>
  </body>
</html>
