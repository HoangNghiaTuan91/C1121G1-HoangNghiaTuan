package ss6_ke_thua.bai_tap.lop_2d_point_va_lop_3d_point;

public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] array = new float[3];
        array[0]=getX();
        array[1]=getY();
        array[2]=getZ();
        return array;
    }

    @Override
    public String toString() {
        return "(x,y,z) ="+"( "+getX()+" , "+getY()+" , "+getZ()+" )";
    }
}
