package query.contracts;

import java.util.List;

public class DeleteQuery {

    public String tableName;
    public List<WhereClause> clauses;
    public List<String> whereOperators;
}
