package query.contracts;

import java.util.List;

public class SelectQuery {

    public String tableName;
    public List<String> colNames;
    public List<WhereClause> whereClauses;
    public List<String> operators;
}
