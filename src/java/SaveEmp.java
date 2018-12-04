import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SaveEmp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        int x=Integer.parseInt(request.getParameter("t1"));
        String y=request.getParameter("t2");
        int z=Integer.parseInt(request.getParameter("t3"));
        
        //mypkg.Emp e=new mypkg.Emp();
        //e.setEno(x); e.setEname(y); e.setSal(z);
        mypkg.Emp e=new mypkg.Emp(x, y, z);
        
        SessionFactory factory=mypkg.Util.getSF();
        Session session=factory.openSession();
        session.save(e);
        session.beginTransaction().commit();
        out.println("<h3>Record Added</h3>");
        out.println("<h4><a href=entry.jsp>Add-More</a></h4>");
        out.println("<h4><a href=index.jsp>Home</a></h4>");
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
