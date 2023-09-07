import java.util.List;

public class stat <t extends List> {

	t set;   
	public stat(t set) {
		this.set = set;
	}
	public void union(t set1, t set2) {
		set.addAll(set1);
		set.addAll(set2);
	}
	public void intersection(t set1, t set2) {
		set.addAll(set1);
		set.retainAll(set2);
	}
	public static <t extends List> void intersection(t set1, t set2, t newSet) {
		set1.addAll(newSet);
		newSet.retainAll(set2);
	}
	public boolean isExclusive(t set1, t set2){
		System.out.println(set1.toString()+set2.toString());
		if(set1.size()!=set2.size()){
			return false;
		}
		for (int i = 0; i < set1.size(); i++) {
			if(!(set2.get(i).equals(set1.get(i)))){
				return false;
			}
		}
		return true;
	}
	public static int Probability(int EventSize, int SampleSpaceSize){
		return(EventSize/SampleSpaceSize);
	}
	public double probabilityOfSetAtIndex(int index){
		double total = 0; int sampleSpace = set.size();
		for(int i = 0; i < set.size(); i++){
			total += Double.parseDouble((String)set.get(i));
		}
		System.out.println(set.get(index)+"/"+total);
		return Double.parseDouble((String)set.get(index))/total;
	}

	public static <t extends List> double proabilityOfSet(t set){
		return 1/set.size();
	}
	
	public static <t extends List> double probabilityOfPrime(t event , t sampleSpace){
		return (1-event.size()/sampleSpace.size());
	}
	public static <t extends List> double probabilityOfEvent(t event, t sampleSpace){
		return (event.size()/sampleSpace.size());
	}
	public static<t extends List> void filterEvenToEvent(t sampleSpace, t newEvent){
		for(int i = 0; i < sampleSpace.size(); i++){
			if(Double.parseDouble((String)sampleSpace.get(i))%2==0){
				newEvent.add(sampleSpace.get(i));
			}
		}
		
	}
	public static <t extends List> void filterOddToEvent(t sampleSpace, t newEvent){
		for(int i = 0; i < sampleSpace.size(); i++){
			if(Double.parseDouble((String)sampleSpace.get(i))%2!=0){
				newEvent.add(sampleSpace.get(i));
			}
		}
	}	

		
	
}
