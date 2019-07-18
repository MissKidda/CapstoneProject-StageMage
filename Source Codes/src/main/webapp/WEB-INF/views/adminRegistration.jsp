3<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE HTML>
<!--
	Striped by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Admin Registratioin</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="/styles/main.css" />
		<link rel="stylesheet" href="/styles/font-awesome.min.css"/>
		<link rel='stylesheet' href="https://fonts.googleapis.com/css?family=Open+Sans">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body class="is-preload">

		<!-- Content -->
		

			<div id="content">
				<div class="inner">
				<article class="box post post-excerpt">
							<header>
								<!--
									Note: Titles and subtitles will wrap automatically when necessary, so don't worry
									if they get too long. You can also remove the <p> entirely if you don't
									need a subtitle.
								-->
								<h2>Register Your Organization or Performance Group</h2>
							</header>
							<div class="info">
								<!--
									Note: The date should be formatted exactly as it's shown below. In particular, the
									"least significant" characters of the month should be encapsulated in a <span>
									element to denote what gets dropped in 1200px mode (eg. the "uary" in "January").
									Oh, and if you don't need a date for a particular page or post you can simply delete
									the entire "date" element.

								-->
								<span>Register</span>
								<!--
									Note: You can change the number of list items in "stats" to whatever you want.
								-->
								
							</div>
		 <div >				
		<form:form action="/registerAdmin" method="post" modelAttribute="admin">
       <section class="box search">
						<label>Name of Organization</label>
		<form:input type="email" class="text" path="email" placeholder="Name of Organization or Group" required="required"/>
         </section>
        <section class="box search">
						<label>Admin Name</label>
			<form:input type="text" class="text" path="fullName" placeholder="First and Last Name" required="required"/>
         </section>
         <section class="box search">
						<label>Email</label>
		<form:input type="email" class="email" path="email" placeholder="Enter email" required="required"/>
         </section>
       <section class="box search">
						<label>Password</label>
		<form:input type="password" class="form input" path="password" placeholder="Enter Password" required="required"/>
         </section>
           <section class="box search">
						<label>About</label>
		<form:input type="text" class="text" path="about" placeholder="A short blurb about you" required="required"/>
         </section>
           <section class="box search">
						<label>Location</label>
		<form:input type="text" class="text" path="location" placeholder="Enter Location" required="required"/>
         </section>
         <input type="submit" class="button submit">
      </form:form>
      
		   </div>						
						</article>

					
				</div>
			</div>

		<!-- Sidebar -->
			<div id="sidebar">

				<!-- Logo -->
					<h1 id="logo"><a href="#">STAGE-MAGE</a></h1>

				<!-- Nav -->
					<nav id="nav">
						<ul>
							<li ><a href="/">HOME</a></li>
							<li ><a href="/eventsHome">EVENTS</a></li>
							<li ><a href="registerUser">REGISTER</a></li>
							<li class="current" ><a href="registerAdmin">REGISTER</a></li>
							<li ><a href="/userhome">MY PROFILE</a></li>
							<li ><a href="/login">LOGIN</a></li>
						</ul>
					</nav>

				<!-- Search -->
					<section class="box search">
						<form method="post" action="#">
							<input type="text" class="text" name="search" placeholder="Search" />
						</form>
					</section>

				<!-- Text -->
					<section class="box text-style1">
						<div class="inner">
							<p>
							<strong><a href="/">STAGE-MAGE</a></strong>An event planning application.
							</p>
						</div>
					</section>

				<!-- Recent Posts -->
					<section class="box recent-posts">
						<header>
							<h2>Upcoming Events</h2>
						</header>
						 <c:forEach var="newEvents" items="${events}">
						 <ul>
						<li>
						<c:out value="${newEvent.eventName }"/>
						</li>
						</ul></c:forEach>
					</section>


				<!-- Calendar -->
					<section class="box calendar">
						<div class="inner">
							<table>
								<caption>July 2014</caption>
								<thead>
									<tr>
										<th scope="col" title="Monday">M</th>
										<th scope="col" title="Tuesday">T</th>
										<th scope="col" title="Wednesday">W</th>
										<th scope="col" title="Thursday">T</th>
										<th scope="col" title="Friday">F</th>
										<th scope="col" title="Saturday">S</th>
										<th scope="col" title="Sunday">S</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td colspan="4" class="pad"><span>&nbsp;</span></td>
										<td><span>1</span></td>
										<td><span>2</span></td>
										<td><span>3</span></td>
									</tr>
									<tr>
										<td><span>4</span></td>
										<td><span>5</span></td>
										<td><span>6</span></td>
										<td><span>7</span></td>
										<td><span>8</span></td>
										<td><span>9</span></td>
										<td><span>10</span></td>
									</tr>
									<tr>
										<td><span>11</span></td>
										<td><span>12</span></td>
										<td><span>13</span></td>
										<td ><span>14</span></td>
										<td><span>15</span></td>
										<td><span>16</span></td>
										<td><span>17</span></td>
									</tr>
									<tr>
										<td><span>18</span></td>
										<td><span>19</span></td>
										<td><span>20</span></td>
										<td><span>21</span></td>
										<td><span>22</span></td>
										<td><span>23</span></td>
										<td><span>24</span></td>
									</tr>
									<tr>
										<td><a href="#">25</a></td>
										<td><span>26</span></td>
										<td><span>27</span></td>
										<td class="today" ><span>28</span></td>
										<td class="pad" colspan="3"><span>&nbsp;</span></td>
									</tr>
								</tbody>
							</table>
						</div>
					</section>

				<!-- Copyright -->
					<ul id="copyright">
						<li>&copy; Stage_Mage</li>
					</ul>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>