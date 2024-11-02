package org.example;

public class Gift {

    private Sweet[] sweets;

    public Gift(Sweet[] sweets) {
        this.sweets = sweets;
    }

    public float getGiftCost()
    {
        float sumCost = 0;
        for (Sweet sweet : sweets)
        {
            sumCost+=sweet.getCost();
        }

        return sumCost;
    }

    public float getGiftWeight()
    {
        float sumWeight = 0;
        for (Sweet sweet : sweets)
        {
            sumWeight+=sweet.getWeight();
        }

        return sumWeight;
    }

    public String getSweetsInfo()
    {
        StringBuilder info = new StringBuilder(new String());
        for (Sweet sweet : sweets)
        {
            info.append("Id:").append(sweet.getId()).append(System.lineSeparator());
            info.append("Имя:").append(sweet.getName()).append(System.lineSeparator());
            info.append("Цена:").append(sweet.getCost()).append(System.lineSeparator());
            info.append("Вес:").append(sweet.getWeight()).append(System.lineSeparator());
            info.append("-----").append(System.lineSeparator());
        }
        info.append("Общая цена:").append(this.getGiftCost()).append(System.lineSeparator());
        info.append("Общий вес:").append(this.getGiftWeight()).append(System.lineSeparator());

        return info.toString();
    }

}
