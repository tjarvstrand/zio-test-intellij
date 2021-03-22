package com.example.ziotest

import zio.ZIO
import zio.test.Assertion._
import zio.test._
import zio.test.junit.JUnitRunnableSpec

class ExampleSpec extends JUnitRunnableSpec  {
  def spec: ZSpec[Environment, Failure] = suite("Example")(
    testM("A failing test")(assertM(ZIO.succeed(1))(equalTo(2))),
    testM("A passing test")(assertM(ZIO.succeed(1))(equalTo(1))),
  )
}
