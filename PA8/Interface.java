public class Interface {
    public class Vampire implements Undead {
        @Override
        public boolean drainLife() {
            // Implementation of draining life
            System.out.println("Draining life...");
            return true;
        }
    }
    
    public class Dragon implements Winged {
        @Override
        public void strafe(Monster monster) {
            // Implementation of strafing attack
            System.out.println("Dragon strafes " + monster.getName() + " with fire!");
        }
    }
    
    public class Werewolf implements Shapeshifter {
        @Override
        public void transform() {
            // Implementation of transformation
            System.out.println("Werewolf transforms under the full moon!");
        }
    }
    
}
