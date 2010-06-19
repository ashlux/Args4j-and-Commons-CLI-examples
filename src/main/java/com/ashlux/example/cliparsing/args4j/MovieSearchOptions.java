package com.ashlux.example.cliparsing.args4j;

import org.kohsuke.args4j.Option;

import java.io.File;

public class MovieSearchOptions
{
    @Option(name = "-name", usage = "Movie name")
    private String name;

    @Option(name = "-year", usage = "Movie release year")
    private int year;

    @Option(name = "-director", usage = "Director")
    private String description;

    @Option(name = "-genre", usage = "Genre")
    private Genre genre;

    @Option(name = "-output", usage = "Output file.", required = true)
    private File outputFile;

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear( int year )
    {
        this.year = year;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public void setGenre( Genre genre )
    {
        this.genre = genre;
    }

    public File getOutputFile()
    {
        return outputFile;
    }

    public void setOutputFile( File outputFile )
    {
        this.outputFile = outputFile;
    }
}
