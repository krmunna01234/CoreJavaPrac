package com.mk.Tview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CountryEntity {
	int countryId;
	String countryName;

	public CountryEntity(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}

// If country1.getCountryId()<country2.getCountryId():then compare method will
// return -1
// If country1.getCountryId()>country2.getCountryId():then compare method will
// return 1
// If country1.getCountryId()==country2.getCountryId():then compare method will
// return 0
class CountrySortByIdComparator implements Comparator<CountryEntity> {

	@Override
	public int compare(CountryEntity country1, CountryEntity country2) {

		return (country1.getCountryId() < country2.getCountryId()) ? -1
				: (country1.getCountryId() > country2.getCountryId()) ? 1 : 0;
	}

}

 class CountryComparatorByIdAndName implements Comparator<CountryEntity> {

    @Override
    public int compare(CountryEntity o1, CountryEntity o2) {
        int flag = o1.getCountryId() - o2.getCountryId();
        if(flag==0) flag = o1.getCountryName().compareTo(o2.getCountryName());
        return flag;
    }

}

public class ComparatorTest {

	public static void main(String[] args) {
		CountryEntity indiaCountry = new CountryEntity(1, "India");
		CountryEntity chinaCountry = new CountryEntity(4, "China");
		CountryEntity nepalCountry = new CountryEntity(3, "Nepal");
		CountryEntity bhutanCountry = new CountryEntity(2, "Bhutan");
		CountryEntity englandCountry = new CountryEntity(2, "England");
		
		List<CountryEntity> listOfCountries = new ArrayList<CountryEntity>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		listOfCountries.add(englandCountry);

		System.out.println("Before Sort by id : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryEntity country = (CountryEntity) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "||" + "Country name: " + country.getCountryName());
		}
		Collections.sort(listOfCountries, new CountrySortByIdComparator());

		System.out.println("After Sort by id: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryEntity country = (CountryEntity) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}

		// Sort by countryName
		Collections.sort(listOfCountries, new Comparator<CountryEntity>() {

			@Override
			public int compare(CountryEntity o1, CountryEntity o2) {
				return o1.getCountryName().compareTo(o2.getCountryName());
			}
		});

		System.out.println("After Sort by name: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryEntity country = (CountryEntity) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}
		
		// SOrt by ID and name
		Collections.sort(listOfCountries, new CountryComparatorByIdAndName());
		System.out.println("After Sort by ID and name: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryEntity country = (CountryEntity) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}

	}

}
