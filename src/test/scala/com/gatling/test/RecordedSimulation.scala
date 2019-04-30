package com.gatling.test

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class RecordedSimulation extends Simulation {

  val host_name = "http://5c7df05bdd19010014c8ea79.mockapi.io/api"

	object GetUserService {
		val serviceCall = exec(http("get_users_service")
			.get(host_name + "/users"))
	}

	object GetOneUserService {
		val serviceCall = exec(http("request_get_swagger_vspoffices")
			.get(host_name + "/users/1"))
	}



	val swagger = scenario("Check Users").exec(GetUserService.serviceCall, GetOneUserService.serviceCall)

	setUp(
		// adds 10 users every second (so a total of 50 users after 5 seconds)
		swagger.inject(constantUsersPerSec(10) during (5 seconds)),
		// Injects users at a constant rate, defined in users per second, during a given duration. Users will be injected at randomized intervals.
		//swagger.inject(constantUsersPerSec(4) during (30 seconds) randomized)
	)
}