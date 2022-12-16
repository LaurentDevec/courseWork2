package courseWork2.app;

import static courseWork2.app.LoadMap.loadMap;

public class Start {
    public static void main(String[] args) {
        Menu mainMenu = new Menu();
        Game game = new Game();
        game.setGameState(loadMap(game.getGame()));
        mainMenu.addItem(new Item("Выход") {
            @Override
            public void run() {
                mainMenu.setExit(true);
            }
        });
        mainMenu.addItem(new Item("Начать игру") {
            @Override
            public void run() {
                game.startGame();
            }
        });
        mainMenu.addItem(new Item("Сохранить игру") {
            @Override
            public void run() {
                game.saveGame();
            }
        });
        mainMenu.addItem(new Item("Загрузить игру") {
            @Override
            public void run() {
                game.loadGame();
            }
        });
        mainMenu.run();
    }
}