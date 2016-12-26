package main.java.patterns.CreationalPatterns.BuilderPattern;

/**
 * Created by aliyuabdullahi on 12/26/16.
 */
public class ArmouredTank {
    private String name;
    private boolean grenadeLunchEnabled;
    private boolean hasTopCover;
    private int numberOfPassengers;
    private double maximumGrenadeDamage;
    private double weightInPounds;

    public static class Builder {
        private String name;
        private boolean grenadeLunchEnabled;
        private boolean hasTopCover;
        private int numberOfPassengers;
        private double maximumGrenadeDamage;
        private double weightInPounds;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGrenadeLunchEnabled(Boolean enabled) {
            this.grenadeLunchEnabled = enabled;
            return this;
        }

        public Builder setHasTopCover(Boolean hasTopCover) {
            this.hasTopCover = hasTopCover;
            return this;
        }

        public Builder setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public Builder setMaximumGrenadeDamage(double maximumGrenadeDamage) {
            this.maximumGrenadeDamage = maximumGrenadeDamage;
            return this;
        }

        public Builder setWeightInPounds(double weightInPounds) {
            this.weightInPounds = weightInPounds;
            return this;
        }

        public ArmouredTank build() {
            if (this.name.isEmpty()) {
                throw new Error("Armoured Tank should have a name");
            }
            if (this.weightInPounds <= 0) {
                throw new Error("Armoured Tank should have a significant weight");
            }
            if (this.numberOfPassengers <= 0) {
                throw new Error("Armoured Tank should have at least one driver");
            }

            return new ArmouredTank(this);
        }
    }

    public ArmouredTank(Builder builder) {
        this.name = builder.name;
        this.grenadeLunchEnabled = builder.grenadeLunchEnabled;
        this.hasTopCover = builder.hasTopCover;
        this.numberOfPassengers = builder.numberOfPassengers;
        this.weightInPounds = builder.weightInPounds;
        this.maximumGrenadeDamage = builder.maximumGrenadeDamage;
    }

    @Override
    public String toString() {
        return "Tank: {\n     Name                 :    " + name + "\n"
                + "     WeightInPounds       :    " + weightInPounds + "\n     "+"GrenadeEnabled       :    "
                + grenadeLunchEnabled
                + "\n     HasTopCover          :    " +hasTopCover+"\n     MaximumGrenadeDamage :    "
                + maximumGrenadeDamage +" imp"
                + "\n     NumberOfPassengers   :    " + numberOfPassengers + "\n}";
    }
}
