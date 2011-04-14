package org.neo4j.lab.neosql

import scala.util.parsing.combinator._

object SQLParser extends JavaTokenParsers {
  def select = "select" ~ ident ~ "from" ~ ident ^^ {
    case "select" ~ column ~ "from" ~ table => Select(SingleColumn(column), From(table))
  }

  def parse(text:String) = parseAll(select, text)
}