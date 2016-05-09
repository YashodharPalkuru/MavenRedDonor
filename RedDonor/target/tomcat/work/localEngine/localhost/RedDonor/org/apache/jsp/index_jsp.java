package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\n");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>RedDonor</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"resources/theme1/styles/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write(" <link href=\"resources/theme1/styles/login.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"resources/theme1/styles/reddonor.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/theme1/styles/bootstrap-social.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/theme1/fa/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <nav class=\"navbar  navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("         \n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Red Donor</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-right \" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">search</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("            <div class=\"account-wall\">\n");
      out.write("                <div id=\"my-tab-content\" class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-pane active\" id=\"login\">\n");
      out.write("               \t\t    <img class=\"profile-img\" src=\"\"   alt=\"\">\n");
      out.write("               \t\t\t<form class=\"form-signin\" action=\"login.htm\" method=\"POST\">\n");
      out.write("               \t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"uname\" placeholder=\"Username\" required autofocus/>\n");
      out.write("\t\t\t\t\t\t    <i class=\"glyphicon glyphicon-user form-control-feedback\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("               \t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("               \t\t\t\t<input type=\"password\" class=\"form-control\" name=\"pwd\" placeholder=\"Password\" required>\n");
      out.write("               \t\t\t\t<i class=\"glyphicon glyphicon-lock form-control-feedback\"></i>\n");
      out.write("               \t\t\t\t</div>\n");
      out.write("               \t\t\t\t\n");
      out.write("               \t\t\t\t<input type=\"submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Sign In\"  />               \t\t\t\t\n");
      out.write("               \t\t\t</form>\n");
      out.write("               \t\t\t\n");
      out.write("               \t\t\t<form class=\"form-signin\" action=\"\" method=\"\">\n");
      out.write("               \t\t\t\t<a class=\"btn btn-block btn-social btn-facebook\" onclick=\"location='fblogin.htm'\">\n");
      out.write("\t\t\t\t\t\t\t    <i class=\"fa fa-facebook\"></i> Sign in with Facebook\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("               \t\t\t    <a class=\"btn btn-block btn-social btn-google\">\n");
      out.write("\t\t\t\t\t\t\t    <i class=\"fa fa-google\"></i>  Sign in with Google\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("               \t\t\t<div id=\"tabs\" data-tabs=\"tabs\">\n");
      out.write("               \t\t\t\t<p class=\"text-center\"><a href=\"#register\" data-toggle=\"tab\">Need an Account?</a></p>\n");
      out.write("              \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-pane\" id=\"register\">\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-signin\" action=\"register1.htm\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"firstname\" class=\"form-control\" placeholder=\"First Name\" required>\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-user form-control-feedback\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"lastname\" class=\"form-control\" placeholder=\"Last Name\" required>\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-user form-control-feedback\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Email\" onchange=\"isEmailAvailable()\" required autofocus>\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-inbox form-control-feedback\"></i>\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\"class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-lock form-control-feedback\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Sign Up\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-signin\" action=\"\" method=\"\">\n");
      out.write("               \t\t\t\t<a class=\"btn btn-block btn-social btn-facebook\" onclick=\"location='fblogin.htm'\">\n");
      out.write("\t\t\t\t\t\t\t    <i class=\"fa fa-facebook\"></i> Sign up with Facebook\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("               \t\t\t    <a class=\"btn btn-block btn-social btn-google\">\n");
      out.write("\t\t\t\t\t\t\t    <i class=\"fa fa-google\"></i>  Sign up with Google\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"tabs\" data-tabs=\"tabs\">\n");
      out.write("               \t\t\t<p class=\"text-center\"><a href=\"#login\" data-toggle=\"tab\">Have an Account?</a></p>\n");
      out.write("              \t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <!-- Put your page content here! -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"resources/theme1/scripts/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"resources/theme1/scripts/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"resources/theme1/scripts/reddonor.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
