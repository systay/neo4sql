package org.neo4j.lab.neosql


case class Select(selectItems: SingleColumn, from: From)

case class SingleColumn(columnName:String)

case class From(tableName:String)