package com.lovedev.cucumber;


import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("com.lovedev.cucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "com.lovedev.cucumber")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "pretty, , html:build/reports/tests/acceptanceTest/cucumber-report.html")
public class RunCucumber {

}