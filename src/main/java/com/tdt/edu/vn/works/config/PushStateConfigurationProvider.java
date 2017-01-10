package com.tdt.edu.vn.works.config;

import javax.servlet.ServletContext;

import org.ocpsoft.logging.Logger.Level;
import org.ocpsoft.rewrite.annotation.RewriteConfiguration;
import org.ocpsoft.rewrite.config.Configuration;
import org.ocpsoft.rewrite.config.ConfigurationBuilder;
import org.ocpsoft.rewrite.config.Direction;
import org.ocpsoft.rewrite.config.Log;
import org.ocpsoft.rewrite.servlet.config.Forward;
import org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider;
import org.ocpsoft.rewrite.servlet.config.Path;
import org.ocpsoft.rewrite.servlet.config.Resource;
import org.ocpsoft.rewrite.servlet.config.ServletMapping;

//@RewriteConfiguration
public abstract class PushStateConfigurationProvider extends HttpConfigurationProvider
{
    /*public Configuration getConfiguration(final ServletContext context)
    {
        return ConfigurationBuilder.begin()
            .addRule()
            .when(Direction.isInbound().and(Path.matches("/{path}"))
                .andNot(Resource.exists("/{path}"))
                .andNot(ServletMapping.includes("/{path}")))
            .perform((Log.message(Level.INFO, "Forwarding to index.html from {path}").and(Forward.to("/index.html"))))
            .where("path").matches(".*");
    }

    public int priority()
    {
         //This provides ordering if you have multiple configurations 
        return 10; 
    } */
}