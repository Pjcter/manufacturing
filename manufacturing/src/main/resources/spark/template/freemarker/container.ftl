<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>KennUware</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">
	</head>
	<body>
	<div class="smallheader">
		<a href="/" style="color:white">
			<h1>KennUware</h1>
		</a>
		<p style="font-size:25px">Container Inventory</p>
	</div>
	<hr>
		<section id="options">
			<div>
				<table id="recipelist">
					<tbody>
						<tr>
							<th>Container ID</th>
							<th>Warehouse Location</th>
							<th>Pallet ID</th>
							<th></th>
						</tr>
						<#list table as row>
							<tr>
								<#list row as str>
									<td style="border: 1px solid black; margin: 0px;">${str}</td>
								</#list>
								<td  style="border: 1px solid black;">
										<button>Add Part</button>
								</td>
								<td  style="border: 1px solid black;">
										<button id="del">Delete</button>
								</td>
							</tr>
						</#list>
					</tbody>
				</table>
			</div>
		</section>
	</body>
</html>