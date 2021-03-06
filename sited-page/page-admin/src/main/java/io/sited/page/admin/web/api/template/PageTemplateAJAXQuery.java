package io.sited.page.admin.web.api.template;

import io.sited.page.api.template.TemplateStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author chi
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PageTemplateAJAXQuery {
    @XmlElement(name = "path")
    public String path;

    @XmlElement(name = "page")
    public Integer page;

    @XmlElement(name = "limit")
    public Integer limit;

    @XmlElement(name = "desc")
    public Boolean desc;

    @XmlElement(name = "sortingField")
    public String sortingField;

    @XmlElement(name = "status")
    public TemplateStatus status;
}
