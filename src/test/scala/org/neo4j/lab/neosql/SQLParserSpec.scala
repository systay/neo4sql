package org.neo4j.lab.neosql

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

class SQLParserSpec extends Spec with ShouldMatchers {
  describe("given a SQL string with a single column and a single table") {
    val sql = "select a from tableA"
    val select: Select = SQLParser.parse(sql).get
    println(select)



    it("should be parsed into a select obj with one selectItem") {
      select.selectItems should be(SingleColumn("a"))
    }

    it("should be parsed into a select with a single from table") {
      select.from should be ( From("tableA") )
    }
  }
}