import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/money")
public class MoneyClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //SELECT cash FROM user WHERE id=?
        HashMap<String, String> db = new HashMap<>();
        db.put("1", "400$");
        db.put("2", "1488$");
        db.put("3", "228$");
        db.put("4", "666$");
        db.put("5", "100$");

        String id = req.getParameter("id");

        if (!db.containsKey(id)){
            getServletContext().getRequestDispatcher("/no-money.jsp").forward(req, resp);
        }

        String cash = db.get(id); // имитация похода в БД

        req.setAttribute("cash", cash);

        getServletContext().getRequestDispatcher("/money-result.jsp").forward(req, resp);
    }
}
