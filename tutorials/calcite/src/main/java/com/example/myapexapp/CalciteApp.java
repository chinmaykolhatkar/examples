package com.example.myapexapp;

import com.datatorrent.api.DAG;
import com.datatorrent.api.StreamingApplication;
import com.datatorrent.api.annotation.ApplicationAnnotation;
import org.apache.hadoop.conf.Configuration;

@ApplicationAnnotation(name = CalciteApp.APPNAME)
public class CalciteApp implements StreamingApplication
{
  public static final String APPNAME = "CalciteApplication";

  @Override public void populateDAG(DAG dag, Configuration configuration)
  {

  }
}
