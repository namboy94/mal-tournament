/*
Copyright 2016 Hermann Krumrey

This file is part of mal-tournament.

    mal-tournament is a program that lets a user pit his watched anime series
    from myanimelist.net against each other in an attempt to determine relative scores
    between the shows.

    mal-tournament is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    mal-tournament is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with mal-tournament. If not, see <http://www.gnu.org/licenses/>.
*/

package net.namibsun.maltourn.java;

import net.namibsun.maltourn.java.gui.SimpleVsRaterGui;
import net.namibsun.maltourn.lib.lists.HummingBirdListGetter;
import net.namibsun.maltourn.lib.objects.AnimeSeries;

import java.io.IOException;
import java.util.Set;

/**
 * Main class that starts the program
 */
public class Main {

    public static void main(String[] args) {

        //new CliMalTournament();
        //new CliSimpleVsRater();
        //new SimpleVsRaterGui();
        try {
            Set<AnimeSeries> series = new HummingBirdListGetter().getCompletedList("namboy94");
            for (AnimeSeries serie: series) {
                if (serie == null) {
                    System.out.println("null");
                    continue;
                }
                System.out.println(serie.getTitle() + ":     " + serie.getImageUrl() + "       " + serie.getScore());
                            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
