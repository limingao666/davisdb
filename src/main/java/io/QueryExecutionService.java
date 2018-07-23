package io;

import query.contracts.CreateTable;
import query.contracts.SelectQuery;
import query.contracts.UpdateQuery;

public class QueryExecutionService {

    public boolean executeUpdateQuery(UpdateQuery q) {
     return true;
    }

    public boolean executeCreateTable(CreateTable q) {
        return true;
    }

    public boolean executeSelectQuery(SelectQuery q) {
        return true;
    }
}
