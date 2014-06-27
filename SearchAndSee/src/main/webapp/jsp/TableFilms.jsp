<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<%@ page import="java.io.IOException"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.seavus.sas.model.Film"%>
<div id="outer_right">
	<div id="inner">
		<div id="centrecontent">
			<div class="conl">
				<table cellpadding="0" cellspacing="0" width="100%">
					<tbody></tbody>
				</table>
				<div class="mt15 mb10">
					<div class="mb10">
						<h2 class="di">Новинки фильмов 2011</h2>
						<span class="ml10"> </span>
					</div>
					<table cellpadding="0" cellspacing="0" width="98%">
						<%
	List<Film> list = (List<Film>)request.getAttribute("Films");
%>
													<table border="2";>
														<tr>
															<th>Column 1 Heading</th>
															<th>Column 2 Heading</th>
															<th>Column 2 Heading</th>
															<th>Column 2 Heading</th>
															<th>Column 2 Heading</th>
														</tr>

														<%
       	for (int i=0; i < list.size(); i++) {
              	 Film film =  list.get(i);
       %>
														<tr>
															<td><%=film.getNameFilm()%></td>
															<td><%=film.getRyear()%></td>
															<td><%=film.getRyear()%></td>
															<td><%=film.getRyear()%></td>
															<td><%=film.getRyear()%></td>



														</tr>
														<%	
	  		}
      %>
													</table>
										</table>
				</div>
				<div>
					<a
						href="http://web.archive.org/web/20101011164359/http://films.imhonet.ru/novelties/">Все
						новинки фильмов 2011</a>
				</div>
				<br class="clear">


			</div>
		</div>
	</div>
</div>
<div id="tooltip" class="" style="display: none;">
	<h3></h3>
	<div class="body"></div>
	<div class="url"></div>
</div>
</body>

