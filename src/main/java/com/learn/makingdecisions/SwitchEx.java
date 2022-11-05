package com.learn.makingdecisions;

public class SwitchEx {
    public static void main(String[] args) {
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "goldfish";
            case 2 -> {
                yield "trout";
            }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "green";
            }
            default -> "swordfish";
        };
    }
}
