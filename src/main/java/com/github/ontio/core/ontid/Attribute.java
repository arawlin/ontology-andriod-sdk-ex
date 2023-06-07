package com.github.ontio.core.ontid;

import com.github.ontio.io.BinaryReader;
import com.github.ontio.io.BinaryWriter;
import com.github.ontio.io.Serializable;

import java.io.IOException;

public class Attribute extends Serializable {
    public byte[] key;
    public byte[] valueType;
    public byte[] value;
    public Attribute(){}
    (valueType);
        writer.writeVarBytes(value);
    }
}
