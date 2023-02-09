
interface  Quest {
    void process();
}
class DeadIslandQuest implements Quest {
    public void process() {
        System.out.println("This is Dead Island Quest!");
    }
}
class EliteKnightQuest  implements Quest {

    public void process() {
        System.out.println("This is Elite Knight Quest!");
    }
}
class Knight {
    private Quest quest;
    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.process();
    }
}
public class Main {
    public static void main(String[] args) {
    Knight k = new Knight(new DeadIslandQuest());
    Knight k2 = new Knight(new EliteKnightQuest());
    k.embarkOnQuest();
    k2.embarkOnQuest();

    }
}