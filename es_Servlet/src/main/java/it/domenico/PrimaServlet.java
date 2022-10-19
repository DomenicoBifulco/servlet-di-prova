package it.domenico;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PrimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "<style>\r\n"
        		+ "div.scrollmenu {\r\n"
        		+ "  background-color: #1e90ff;\r\n"
        		+ "  overflow: auto;\r\n"
        		+ "  white-space: nowrap;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "div.scrollmenu a {\r\n"
        		+ "  display: inline-block;\r\n"
        		+ "  color: white;\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  padding: 14px;\r\n"
        		+ "  text-decoration: none;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "div.scrollmenu a:hover {\r\n"
        		+ "  background-color: #87cefa;\r\n"
        		+ "}\r\n"
        		+ ".vertical-menu {\r\n"
        		+ "  width: 200px;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".vertical-menu a {\r\n"
        		+ "  background-color: #e0ffff;\r\n"
        		+ "  color: black;\r\n"
        		+ "  display: block;\r\n"
        		+ "  padding: 12px;\r\n"
        		+ "  text-decoration: none;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".vertical-menu a:hover {\r\n"
        		+ "  background-color: #87cefa;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".vertical-menu a.active {\r\n"
        		+ "  background-color: #1e90ff;\r\n"
        		+ "  color: white;\r\n"
        		+ "}\r\n"
        		+ "footer {\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  padding: 3px;\r\n"
        		+ "  background-color: #1e90ff;\r\n"
        		+ "  color: white;\r\n"
        		+ "	 display: block;"
        		+ "\r\n"
        		+ "  position:fixed;\r\n"
        		+ "  bottom:0;\r\n"
        		+ "  left:0;\r\n"
        		+ "  right:0;"
        		+ "}\r\n"
        		+ "</style>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "<h1 align = center> primo esercizio</h1>\r\n"
        		+ "<div class=\"scrollmenu\">\r\n"
        		+ "  <a href=\"#home\">Home</a>\r\n"
        		+ "  <a href=\"#news\">News</a>\r\n"
        		+ "  <a href=\"#contact\">Contact</a>\r\n"
        		+ "  <a href=\"#about\">About</a>\r\n"
        		+ "  <a href=\"#support\">Support</a>\r\n"
        		+ "  <a href=\"#blog\">Blog</a>\r\n"
        		+ "</div><br><br>\r\n"
        		+ "\r\n"
        		+ "<div class=\"vertical-menu\" align = center>\r\n"
        		+ "  <a href=\"#\" class=\"active\">MENU</a>\r\n"
        		+ "  <a href=\"#\">vuoto</a>\r\n"
        		+ "  <a href=\"#\">vuoto</a>\r\n"
        		+ "  <a href=\"#\">vuoto</a>\r\n"
        		+ "  <a href=\"#\">vuoto</a>\r\n"
        		+ "  <a href=\"#\">vuoto</a>\r\n"
        		+ "  <a href=\"#\">vuoto</a>\r\n"
        		+ "</div>\r\n"
        		+ "<footer>\r\n"
        		+ "  <p>footer<br>\r\n"
        		+ "  <a href=\"mailto:hege@example.com\">hege@example.com</a></p>\r\n"
        		+ "</footer>\r\n"
        		+ "\r\n"
        		+ "</body>\r\n"
        		+ "</html>");
        w.flush();
        w.close();
    }
}
