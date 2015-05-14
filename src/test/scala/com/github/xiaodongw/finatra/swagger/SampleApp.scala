package com.github.xiaodongw.finatra.swagger

import com.twitter.finatra.FinatraServer

object SampleApp extends FinatraServer {
  FinatraSwagger.registerInfo(
    description = "The Student / Course management API, this is a sample for swagger document generation",
    version = "1.0.1",
    title = "Student / Course Management API")

  register(new SwaggerController())
  register(new SampleController)
}
