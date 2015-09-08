//Ben Meyerson
//homework 2
//Arithmetic.java
//
//define class
public class Arithmetic{
    public static void main(String [] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //percent of tax
        double taxPercent=0.06;
        //to calculate total cost of the socks with tax
        double totalCostsock$;
        double taxSock$;
        double totalCostsockaftertax$;
        //to calculate total cost of the glasses with tax
        double totalCostglass$;
        double taxGlass$;
        double totalCostglassaftertax$;
        //to calculate total cost of envelopes with tax
        double totalCostenvelope$;
        double taxEnvelope$;
        double totalCostenvelopeaftertax$;
        //to calculate the total cost of the purchase before tax
        double totalPurchasenotax$;
        //to calculate total amount of tax
        double totalTax$;
        //to calculate the total cost of the purchase after tax
        double totalPurchasetax$;
        //to round the values
        double sockR;
        double sockNew;
        double glassR;
        double glassNew;
        double envelopeR;
        double envelopeNew;
        double totalNew;
        double totalR;
        
        
        //to calculate total cost of the socks with tax
        totalCostsock$=nSocks * sockCost$;
        taxSock$=totalCostsock$ * taxPercent;
        totalCostsockaftertax$=totalCostsock$ + taxSock$;
        //to calculate total cost of the glasses with tax
        totalCostglass$=nGlasses * glassCost$;
        taxGlass$=totalCostglass$ * taxPercent;
        totalCostglassaftertax$=totalCostglass$ * taxGlass$;
        //to calculate total cost of envelopes with tax
        totalCostenvelope$=nEnvelopes * envelopeCost$;
        taxEnvelope$=totalCostenvelope$ * taxPercent;
        totalCostenvelopeaftertax$=totalCostenvelope$ + taxEnvelope$;
        //to calculate total cost all together before tax
        totalPurchasenotax$=totalCostsock$ + totalCostglass$ + totalCostenvelope$;
        //to calculate total tax
        totalTax$ = totalPurchasenotax$ * taxPercent;
        //to calculate total cost al together after tax
        totalPurchasetax$ = totalPurchasenotax$ + totalTax$;
        //rounding responces to be like currency
        sockNew = Math.round(totalCostsockaftertax$ * 100);
            sockR = sockNew/100;
        glassNew = Math.round(totalCostglassaftertax$ * 100);
            glassR = glassNew/100;
        envelopeNew = Math.round(totalCostenvelopeaftertax$ * 100);
            envelopeR = envelopeNew/100;
        totalNew = Math.round(totalPurchasetax$ * 100);
            totalR = totalNew/100;
            
        
        System.out.println("The cost of the socks before tax is $" + totalCostsock$);
        System.out.println("The tax on those socks is $" + taxSock$);
        System.out.println("The total cost of the socks is $" + sockR);
        System.out.println("____________________________________________");
        System.out.println("The cost of the glasses before tax is $" + totalCostglass$);
        System.out.println("The tax on those glasses is $" + taxGlass$);
        System.out.println("The total cost of the glasses is $" + glassR);
        System.out.println("____________________________________________");
        System.out.println("The cost of the envelopes before tax is $" + totalCostenvelope$);
        System.out.println("The tax on those envelopes is $" + taxEnvelope$);
        System.out.println("The total cost of the envelopes is $" + envelopeR);
        System.out.println("____________________________________________");
        System.out.println("The entire purchase costs $" + totalPurchasenotax$ + " before taxes");
        System.out.println("The entire purchase costs $" + totalR + " after taxes");
        
    }
}