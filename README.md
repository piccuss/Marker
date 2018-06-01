# Marker 

[![Build Status](https://travis-ci.com/piccuss/Marker.svg?branch=master)](https://travis-ci.com/piccuss/Marker) [![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.piccuss/marker/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.piccuss/marker) 

Build markdown by java.The following tags are supported.

* Header
* Quote
* Image
* UnorderedList
* Table
* Link

## Usage

### intergration

#### maven

        <dependency>
        <groupId>com.github.piccuss</groupId>
        <artifactId>marker</artifactId>
        <version>0.0.2</version>
        </dependency>

#### Gradle

        dependencies {
                compile 'com.github.piccuss:marker:0.0.1'
        }

### Example

        MarkdownBuilder markdownBuilder = new MarkdownBuilder().addHeader("Total Header")
                .addHeader("Sub Header", 2)
                .addText("First paragraph")
                .addImage("me", "https://assets.yande.re/data/preview/db/c5/dbc571a28fd3e2f9df99037a131e5a52.jpg")
                .addQuote("this is a test\nwelcome\n\rhello,world")
                .addList(Arrays.asList("bird", "dog", "cat", 45));
        Table table = new Table().setAlignments(Table.ALIGN_LEFT, Table.ALIGN_CENTER, Table.ALIGN_RIGHT)
                .addRow("Title", "date", "name")
                .addRow("hello", "20180502", "piccus")
                .addRow("back to", "20180503", "tella");
        markdownBuilder.addTable(table).addLink("Google", "http://www.google.com.jp");
