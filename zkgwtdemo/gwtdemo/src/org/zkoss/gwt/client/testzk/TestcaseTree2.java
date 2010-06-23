package org.zkoss.gwt.client.testzk;


import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listfoot;
import org.zkoss.gwt.client.zul.sel.Listfooter;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treecell;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treecol;
import org.zkoss.gwt.client.zul.sel.Treecols;
import org.zkoss.gwt.client.zul.sel.Treefoot;
import org.zkoss.gwt.client.zul.sel.Treefooter;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.sel.Treerow;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseTree2 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();


		/*		from B50-2971982.zul
		 <window>
			Check listbox's Second footer and tree's is in third column
			
				<listbox width="300px">
					<listhead>
						<listheader label="First" />
						<listheader label="Second" />
						<listheader label="Third" />
					</listhead>
					<listitem>
						<listcell label="test1" />
						<listcell label="test2" />
						<listcell label="test3" />
					</listitem>
					<listfoot>
						<listfooter span="2" label="2 span footer" />
						<listfooter label="Second footer" />
					</listfoot>
				</listbox>
				<separator />
				<tree width="300px">
					<treecols>
						<treecol label="First" />
						<treecol label="Second" />
						<treecol label="Third" />
					</treecols>
					<treechildren>
						<treeitem>
							<treerow>
								<treecell label="test1" />
								<treecell label="test2" />
								<treecell label="test3" />
							</treerow>
						</treeitem>
					</treechildren>
					<treefoot>
						<treefooter span="2" label="2 span footer" />
						<treefooter label="Second footer" />
					</treefoot>
				</tree>
			
		</window>
		*/
		
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Checklistbox'sSecondfooterandtree'sisinthirdcolumn");
		Listbox listbox_12 = new Listbox();
		window_1.add(listbox_12);
		listbox_12.setWidth("300px");
		Listhead listhead_121 = new Listhead();
		listbox_12.add(listhead_121);
		Listheader listheader_1211 = new Listheader();
		listhead_121.add(listheader_1211);
		listheader_1211.setLabel("First");
		Listheader listheader_1212 = new Listheader();
		listhead_121.add(listheader_1212);
		listheader_1212.setLabel("Second");
		Listheader listheader_1213 = new Listheader();
		listhead_121.add(listheader_1213);
		listheader_1213.setLabel("Third");
		Listitem listitem_122 = new Listitem();
		listbox_12.add(listitem_122);
		Listcell listcell_1221 = new Listcell();
		listitem_122.add(listcell_1221);
		listcell_1221.setLabel("test1");
		Listcell listcell_1222 = new Listcell();
		listitem_122.add(listcell_1222);
		listcell_1222.setLabel("test2");
		Listcell listcell_1223 = new Listcell();
		listitem_122.add(listcell_1223);
		listcell_1223.setLabel("test3");
		Listfoot listfoot_123 = new Listfoot();
		listbox_12.add(listfoot_123);
		Listfooter listfooter_1231 = new Listfooter();
		listfoot_123.add(listfooter_1231);
		listfooter_1231.setLabel("2 span footer");
		listfooter_1231.setSpan(2);
		Listfooter listfooter_1232 = new Listfooter();
		listfoot_123.add(listfooter_1232);
		listfooter_1232.setLabel("Second footer");
		Separator separator_13 = new Separator();
		window_1.add(separator_13);
		Tree tree_14 = new Tree();
		window_1.add(tree_14);
		tree_14.setWidth("300px");
		Treecols treecols_141 = new Treecols();
		tree_14.add(treecols_141);
		Treecol treecol_1411 = new Treecol();
		treecols_141.add(treecol_1411);
		treecol_1411.setLabel("First");
		Treecol treecol_1412 = new Treecol();
		treecols_141.add(treecol_1412);
		treecol_1412.setLabel("Second");
		Treecol treecol_1413 = new Treecol();
		treecols_141.add(treecol_1413);
		treecol_1413.setLabel("Third");
		Treechildren treechildren_142 = new Treechildren();
		tree_14.add(treechildren_142);
		Treeitem treeitem_1421 = new Treeitem();
		treechildren_142.add(treeitem_1421);
		Treerow treerow_14211 = new Treerow();
		treeitem_1421.add(treerow_14211);
		Treecell treecell_142111 = new Treecell();
		treerow_14211.add(treecell_142111);
		treecell_142111.setLabel("test1");
		Treecell treecell_142112 = new Treecell();
		treerow_14211.add(treecell_142112);
		treecell_142112.setLabel("test2");
		Treecell treecell_142113 = new Treecell();
		treerow_14211.add(treecell_142113);
		treecell_142113.setLabel("test3");
		Treefoot treefoot_143 = new Treefoot();
		tree_14.add(treefoot_143);
		Treefooter treefooter_1431 = new Treefooter();
		treefoot_143.add(treefooter_1431);
		treefooter_1431.setLabel("2 span footer");
		treefooter_1431.setSpan(2);
		Treefooter treefooter_1432 = new Treefooter();
		treefoot_143.add(treefooter_1432);
		treefooter_1432.setLabel("Second footer");

				
		return win;
	}
}
