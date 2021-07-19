package leminhdang;

import java.io.Serializable;
import java.util.ArrayList;


public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<MovePoint> arrMyPoint;
	private ArrayList<Line> arrMyLine;

	final int r = 15, r2 = 2 * r;

	public ArrayList<MovePoint> getArrMyPoint() {
		return arrMyPoint;
	}

	public void setArrMyPoint(ArrayList<MovePoint> arrMyPoint) {
		this.arrMyPoint = arrMyPoint;
	}

	public ArrayList<Line> getArrMyLine() {
		return arrMyLine;
	}

	public void setArrMyLine(ArrayList<Line> arrMyLine) {
		this.arrMyLine = arrMyLine;
	}

	public Data() {
		arrMyPoint = new ArrayList<MovePoint>();
		arrMyLine = new ArrayList<Line>();
	}
}
