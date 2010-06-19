package com.ashlux.example.cliparsing.args4j;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class Args4jExample
{
    public static void main( String[] args )
    {
        MovieSearchOptions movieSearchOptions = new MovieSearchOptions();
        CmdLineParser parser = new CmdLineParser( movieSearchOptions );
        parser.setUsageWidth( 120 );
        try
        {
            parser.parseArgument( args );
            doWork( movieSearchOptions );
        }
        catch ( CmdLineException e )
        {
            System.err.println( e.getMessage() );
            parser.printUsage( System.err );
        }
    }

    private static void doWork( MovieSearchOptions movieSearchOptions )
    {
        // do movie search here
    }
}