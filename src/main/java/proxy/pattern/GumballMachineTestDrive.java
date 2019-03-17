package proxy.pattern;

import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);
            System.out.println("Before rebind");
            Naming.rebind("gumballmachine", gumballMachine);
            System.out.println("After rebind");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
