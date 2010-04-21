package org.zkoss.gwt.client.zkmax.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Tablechildren extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkmax.layout.Tablechildren();
	}-*/;

	
	public native void setColspan(int colspan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColspan(colspan);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Tablechildren.js line:[28]
	
	public native int getColspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColspan();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Tablechildren.js line:[24]
	
	public native void setRowspan(int rowpsan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRowspan(rowpsan);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Tablechildren.js line:[40]
	
	public native int getRowspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRowspan();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Tablechildren.js line:[36]
}
