package hsl.domain.model.mp.scenic;

import hg.common.component.BaseModel;
import hsl.domain.model.M;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


/**
 * 景点图片明细
 * 
 * @author Administrator
 */
@SuppressWarnings("serial")
@Entity
@Table(name=M.TABLE_PREFIX_HSL_MP +"IMAGE_SPEC")
public class MPImageSpec extends BaseModel{

	/**
	 * 景点
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SCENIC_SPOT_ID")
	private MPScenicSpot scenicSpot;
	
	/**
	 * 图片地址
	 */
	@Column(name = "URL", length = 256)
	private String url;

	/**
	 * 图片标识
	 */
	@Column(name = "ALBUM_ID", length = 64)
	private String albumId;

	/**
	 * 是否有水印
	 */
	@Type(type = "yes_no")
	@Column(name = "WATERMARK")
	private Boolean watermark;

	/**
	 * 尺寸代码
	 */
	@Column(name = "SIZE_CODE", length = 64)
	private String sizeCode;

	/**
	 * 尺寸信息
	 */
	@Column(name = "SIZE_", length = 64)
	private String size;

	/**
	 * 宽PX
	 */
	@Column(name = "WIDTH", columnDefinition = M.NUM_COLUM)
	private Integer width;

	/**
	 * 高PX
	 */
	@Column(name = "HEIGHT", columnDefinition = M.NUM_COLUM)
	private Integer height;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public Boolean getWatermark() {
		return watermark;
	}

	public void setWatermark(Boolean watermark) {
		this.watermark = watermark;
	}

	public String getSizeCode() {
		return sizeCode;
	}

	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

}