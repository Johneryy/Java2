package tdd;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

    public class KataTest {
        @Test
        public void scoresTestBetween90_100() {
            Scores input = new Scores();
            String grade = input.getScores(95);
            assertEquals("A", grade);
        }

        @Test
        public void scoresTestBetween80_90() {
            Scores input = new Scores();
            String grade = input.getScores(85);
            assertEquals("B", grade);
        }

        @Test
        public void scoresTestBetween70_80() {
            Scores input = new Scores();
            String grade = input.getScores(75);
            assertEquals("C", grade);
        }

        @Test
        public void scoresTestBetween60_70() {
            Scores input = new Scores();
            String grade = input.getScores(65);
            assertEquals("D", grade);
        }

        @Test
        public void scoresTestBetween60AndBelow() {
            Scores input = new Scores();
            String grade = input.getScores(55);
            assertEquals("F", grade);
        }


        @Test
        public void bubaTestForPassAndFail() {
            Kata buba = new Kata();

            int userScore = buba.bubaTestForPassAndFail(55);

            assertEquals("Pass", userScore);

        }

        @Test
        public void factorsTest() {
            int factors = Kata.noOfFactorsOf(5);
            assertEquals(2,factors);

            factors = Kata.noOfFactorsOf(10);
            assertEquals(4,factors);
        }


    }