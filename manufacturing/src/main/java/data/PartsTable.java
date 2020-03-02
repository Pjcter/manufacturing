package data;

import domain.Part;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class PartsTable {


    private Sql2o sql2o;

    public PartsTable(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    //TODO: Update SQL statement to match table params
    public List<Part> getAllParts(){
        //
        String sql =
                "SELECT part_id, serial_num, warehouse_loc, container_id, defective " +
                        "FROM part";

        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Part.class);
        }
    }
/**
    //TODO: Update SQL statement to be a valid INSERT statement that amtches the given recipe
    public boolean addPart(Part part){
        //
        String sql =
                "SELECT id, description, duedate " +
                        "FROM tasks";

        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeUpdate();
        }
    }

    //TODO: Update SQL statement to be a valid DELETE statement that amtches the given recipe
    public boolean deletePart(Part part){
        //
        String sql =
                "SELECT id, description, duedate " +
                        "FROM tasks";

        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeUpdate();
        }
    }
*/
}
