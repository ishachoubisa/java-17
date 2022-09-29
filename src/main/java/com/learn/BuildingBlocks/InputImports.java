package com.learn.BuildingBlocks;

import java.nio.file.Paths;
import java.nio.file.Files;
//import java.nio.*;//No Good- a wildcard matches only class names, not "files.Files"
//import java.nio.*.*;//No Good- you can only have one wildcard and it must be at the end
//import java.nio.file.Paths.*;//No Good- you cannot import methods only class names

public class InputImports {
    public void read(Files files){
        Paths.get("name");
    }
}
