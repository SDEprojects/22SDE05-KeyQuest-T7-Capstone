package com.game;

class GameOverPage {

    static String art = "  ▄████  ▄▄▄       ███▄ ▄███▓▓█████     ▒█████   ██▒   █▓▓█████  ██▀███  \n" +
                        " ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    ▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒\n" +
                        "▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      ▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒\n" +
                        "░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    ▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  \n" +
                        "░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   ░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒\n" +
                        " ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   ░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░\n" +
                        "  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░     ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░\n" +
                        "░ ░   ░   ░   ▒   ░      ░      ░      ░ ░ ░ ▒       ░░     ░     ░░   ░ \n" +
                        "      ░       ░  ░       ░      ░  ░       ░ ░        ░     ░  ░   ░     \n" +
                        "                                                     ░                   \n" +
                        "                / \\\n" +
                        "               / _ \\\n" +
                        "              | / \\ |\n" +
                        "              ||   || _______\n" +
                        "              ||   || |\\     \\\n" +
                        "              ||   || ||\\     \\\n" +
                        "              ||   || || \\    |\n" +
                        "              ||   || ||  \\__/\n" +
                        "              ||   || ||   ||\n" +
                        "               \\\\_/ \\_/ \\_//\n" +
                        "              /   _     _   \\\n" +
                        "             /               \\\n" +
                        "             |    X     X    |\n" +
                        "             |   \\  ___  /   |\n" +
                        "            /     \\ \\_/ /     \\\n" +
                        "           /  -----  |  -----  \\\n" +
                        "           |     \\__/|\\__/     |\n" +
                        "           \\       |_|_|       /\n" +
                        "            \\_____       _____/\n" +
                        "                  \\     /\n" +
                        "                  |     |";
    public static void over() throws InterruptedException {
        for (int i = 0; i < art.length(); i++){
            System.out.print(art.charAt(i));
          //  Thread.sleep(2);
        }
        System.out.println("\nGame Over!");
    }


}