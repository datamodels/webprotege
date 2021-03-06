package edu.stanford.bmir.protege.web.server.owlapi.change;

import org.semanticweb.owlapi.change.AddAxiomData;
import org.semanticweb.owlapi.change.OWLOntologyChangeData;
import org.semanticweb.owlapi.change.OWLOntologyChangeRecord;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntologyID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 18/07/2013
 */
public class OWLOntologyChangeRecordList implements Iterable<OWLOntologyChangeRecord> {


    private List<OWLOntologyChangeRecord> changeRecordList = null;

    private int size;

    public OWLOntologyChangeRecordList() {
        changeRecordList = Collections.emptyList();
    }

    public OWLOntologyChangeRecordList(List<OWLOntologyChangeRecord> list) {
        changeRecordList = new ArrayList<OWLOntologyChangeRecord>(list);
    }


    public int size() {
        return changeRecordList.size();
    }

    public boolean isEmpty() {
        return changeRecordList.isEmpty();
    }

    public Iterator<OWLOntologyChangeRecord> iterator() {
        return changeRecordList.iterator();
    }

}
