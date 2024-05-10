package org.zxx17.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.zxx17.id.SnowFlakeFactory;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("t_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = -1329173923755780293L;

    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    @TableField("t_order_id")
    private Long orderId;

    /**
     * 商品id
     */
    @TableField("t_pro_id")
    private Long proId;

    /**
     * 商品名称
     */
    @TableField("t_pro_name")
    private String proName;

    /**
     * 商品价格（单价）
     */
    @TableField("t_pro_price")
    private BigDecimal proPrice;

    /**
     * 购买数量
     */
    @TableField("t_number")
    private Integer number;

    public OrderItem(){
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }
}