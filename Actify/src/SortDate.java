import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class SortDate implements Comparable<SortDate>{
	private int id;
	private Date date;

	public SortDate(int id, Date date) {
		this.id = id;
		this.date = date;
	}

	@Override
	public int compareTo(SortDate sortDate) {

		return this.date.compareTo(sortDate.getDate());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public static void main(String[] args) throws ParseException {
		List<SortDate> list = new ArrayList<SortDate>();
		list.add(new SortDate(1, new SimpleDateFormat("MMM-yyyy").parse("Apr-2020")));
		list.add(new SortDate(2, new SimpleDateFormat("MMM-yyyy").parse("Jun-2020")));
		list.add(new SortDate(3, new SimpleDateFormat("MMM-yyyy").parse("May-2020")));
		list.add(new SortDate(4, new SimpleDateFormat("MM-yyyy").parse("07-2020")));

		Collections.sort(list);

		for (SortDate data : list) {
			System.out.println(data.getDate());
		}
	}

}
