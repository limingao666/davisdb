package query.contracts;

import java.util.List;

public class UpdateQuery {

    public String tableName;
    public List<String> columnNames;
    public List<String> columnValues;
    public List<DataType> columnTypes;

    public List<WhereClause> clauses;
    public List<String> whereOperators;
}
